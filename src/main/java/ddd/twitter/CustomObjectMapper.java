package ddd.twitter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;
import static com.fasterxml.jackson.annotation.PropertyAccessor.GETTER;
import static com.fasterxml.jackson.annotation.PropertyAccessor.SETTER;

class CustomObjectMapper {
    ObjectMapper ofDirectFieldAccess() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.setVisibility(GETTER, JsonAutoDetect.Visibility.NONE);
        mapper.setVisibility(SETTER, JsonAutoDetect.Visibility.NONE);
        return mapper;
    }
}
