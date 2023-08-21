package com.atbilibili.springboottestlearn.annotation;

import com.atbilibili.springboottestlearn.configeration.myCOnfigeration;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(myCOnfigeration.class)
public @interface Myannotation {
}
