package com.DevLomoSE.SBWeb.app.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * TitulosConfig at: src/main/java/com/DevLomoSE/SBWeb/app/configuration
 * Created by @DevLomoSE at 13/9/21 9:28.
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:titulos.properties")
})
public class TitulosConfig {

}
