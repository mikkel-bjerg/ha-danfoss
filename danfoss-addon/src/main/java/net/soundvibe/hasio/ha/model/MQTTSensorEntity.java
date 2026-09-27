package net.soundvibe.hasio.ha.model;

import java.util.Map;

public record MQTTSensorEntity(String unique_id,
                               String name,
                               String device_class,
                               String state_class,
                               String unit_of_measurement,
                               String state_topic,
                               String value_template,
                               String availability_topic,
                               String availability_template,
                               String json_attributes_topic,
                               String json_attributes_template,
                               Map<String, String> device) {}
