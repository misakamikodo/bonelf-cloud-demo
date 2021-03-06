package com.bonelf.test.config;

import com.bonelf.test.web.domain.vo.TestConverterVO;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

// @JsonComponent
public class TestSerializer  extends JsonSerializer<TestConverterVO> {

	@Override
	public void serialize(TestConverterVO value, JsonGenerator gen,
						  SerializerProvider serializers) throws IOException, JsonProcessingException {
		gen.writeStartObject();
		gen.writeEndObject();
	}
}