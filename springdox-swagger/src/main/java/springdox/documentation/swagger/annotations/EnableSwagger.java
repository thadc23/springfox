package springdox.documentation.swagger.annotations;

import org.springframework.context.annotation.Import;
import springdox.documentation.swagger.configuration.SwaggerSpringMvcDocumentationConfiguration;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that Swagger support should be enabled.
 *
 * This should be applied to a Spring java config and should have an accompanying '@Configuration' annotation.
 *
 * Loads all required beans defined in @see SpringSwaggerConfig
 *
 * @see springdox.documentation.spring.web.plugins.DocumentationConfigurer
 */
@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = {java.lang.annotation.ElementType.TYPE})
@Documented
@Import(SwaggerSpringMvcDocumentationConfiguration.class)
public @interface EnableSwagger {
}