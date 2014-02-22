package internshipchina



import grails.test.mixin.*
import spock.lang.*

@TestFor(InternInfoController)
@Mock(InternInfo)
class InternInfoControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.internInfoInstanceList
            model.internInfoInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.internInfoInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            def internInfo = new InternInfo()
            internInfo.validate()
            controller.save(internInfo)

        then:"The create view is rendered again with the correct model"
            model.internInfoInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            internInfo = new InternInfo(params)

            controller.save(internInfo)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/internInfo/show/1'
            controller.flash.message != null
            InternInfo.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def internInfo = new InternInfo(params)
            controller.show(internInfo)

        then:"A model is populated containing the domain instance"
            model.internInfoInstance == internInfo
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def internInfo = new InternInfo(params)
            controller.edit(internInfo)

        then:"A model is populated containing the domain instance"
            model.internInfoInstance == internInfo
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/internInfo/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def internInfo = new InternInfo()
            internInfo.validate()
            controller.update(internInfo)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.internInfoInstance == internInfo

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            internInfo = new InternInfo(params).save(flush: true)
            controller.update(internInfo)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/internInfo/show/$internInfo.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/internInfo/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def internInfo = new InternInfo(params).save(flush: true)

        then:"It exists"
            InternInfo.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(internInfo)

        then:"The instance is deleted"
            InternInfo.count() == 0
            response.redirectedUrl == '/internInfo/index'
            flash.message != null
    }
}
