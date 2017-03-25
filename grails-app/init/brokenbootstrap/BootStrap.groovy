package brokenbootstrap

import grails.core.GrailsApplication
import org.springframework.beans.factory.annotation.Value

class BootStrap {

    @Value('${info.app.version}')
     String appVersion

    GrailsApplication grailsApplication

     def init = { servletContext ->
         println "From GrailsApplication: ${grailsApplication.metadata.getApplicationVersion()}"
         println "From Config: $appVersion"
     }
    def destroy = {
    }
}
