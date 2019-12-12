package com.sian.app.breed.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

/**
 * fastjson配置文件
 * @ClassName：HttpMessageConverterConfig
 * @authur：xiaoqing 13321131951@163.com
 * @date：2018年9月12日 下午10:55:35
 * @version 1.0
 */
@Configuration
public class HttpMessageConverterConfig extends WebMvcConfigurationSupport {

	/*
	 * 必须在pom.xml引入fastjson的jar包，并且版必须大于1.2.10
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// 1、定义一个convert转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		// 2、添加fastjson的配置信息
		FastJsonConfig fastJsonConfig = new FastJsonConfig();

		SerializerFeature[] serializerFeatures = new SerializerFeature[] {
				// List字段如果为null,输出为[],而非null
				SerializerFeature.WriteNullListAsEmpty,
				// 字符类型字段如果为null,输出为"",而非null
				SerializerFeature.WriteNullStringAsEmpty,
				// Boolean字段如果为null,输出为false,而非null
				SerializerFeature.WriteNullBooleanAsFalse,
				// Date的日期转换器
				SerializerFeature.WriteDateUseDateFormat,
				// 循环引用
				SerializerFeature.DisableCircularReferenceDetect, };

		fastJsonConfig.setSerializerFeatures(serializerFeatures);
		fastJsonConfig.setCharset(Charset.forName("UTF-8"));

		// 3、在convert中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		converters.add(fastConverter);
	}
}
