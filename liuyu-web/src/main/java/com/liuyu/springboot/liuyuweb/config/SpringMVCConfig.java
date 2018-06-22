package com.liuyu.springboot.liuyuweb.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: SpringMVCConfig <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-6-22 下午3:40 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@Configuration
public class SpringMVCConfig extends WebMvcConfigurationSupport {


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteNullBooleanAsFalse,
                SerializerFeature.WriteEnumUsingToString);
        FastJsonHttpMessageConverter4 c1 = new FastJsonHttpMessageConverter4();
        c1.setFastJsonConfig(fastJsonConfig);
        converters.add(c1);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/").setCachePeriod(0);
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/resources/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/css/**")
//                .addResourceLocations("classpath:/css/");
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
//        registry.addResourceHandler("/ftl/**").addResourceLocations("classpath:/view/");
//        registry.addResourceHandler("/images/**").addResourceLocations("file:" + imagePath);
//        registry.addResourceHandler("/file/**").addResourceLocations("file:" + imagePath);
        super.addResourceHandlers(registry);
    }


    @Bean(name = "viewResolver")
    @Primary
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver() {
        List<View> views = new ArrayList<View>();
        views.add(fastJsonJsonView());

        ContentNegotiatingViewResolver viewResolver = new ContentNegotiatingViewResolver();
        viewResolver.setDefaultViews(views);
        return viewResolver;
    }

//    @Bean
//    public HttpMessageConverters customConverters() {
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteDateUseDateFormat,
//                SerializerFeature.WriteMapNullValue,
//                SerializerFeature.WriteNullStringAsEmpty,
//                SerializerFeature.WriteNullNumberAsZero,
//                SerializerFeature.WriteNullBooleanAsFalse,
//                SerializerFeature.WriteEnumUsingToString);
//        FastJsonHttpMessageConverter4 c1 = new FastJsonHttpMessageConverter4();
//        c1.setFastJsonConfig(fastJsonConfig);
//
//        FormHttpMessageConverter c2 = new FormHttpMessageConverter();
//        ByteArrayHttpMessageConverter c3 = new ByteArrayHttpMessageConverter();
//        StringHttpMessageConverter c4 = new StringHttpMessageConverter();
//        ResourceHttpMessageConverter c5 = new ResourceHttpMessageConverter();
//        SourceHttpMessageConverter c6 = new SourceHttpMessageConverter();
//        BufferedImageHttpMessageConverter c7 = new BufferedImageHttpMessageConverter();
//        return new HttpMessageConverters(c1, c2, c3, c4, c5, c6, c7);
//    }

    @Bean
    public FastJsonJsonView fastJsonJsonView() {

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteDateUseDateFormat,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNullNumberAsZero,
                SerializerFeature.WriteNullBooleanAsFalse,
                SerializerFeature.WriteEnumUsingToString);
        fastJsonConfig.setDateFormat("yyyy-MM-dd");
        FastJsonJsonView view = new FastJsonJsonView();
        view.setFastJsonConfig(fastJsonConfig);
        return view;
    }


}
