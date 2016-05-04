package pl.mproch.osgi.question;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Sample Configuration")
public @interface SampleConfig {

    String stringProperty() default "default";

    int intProperty() default 0;

    boolean booleanProperty() default false;
}


