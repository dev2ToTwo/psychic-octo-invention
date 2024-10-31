package edu.example.kotlindevelop.domain.member.config

import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RootConfig {
    @Bean
    fun modelMapper() : ModelMapper {
        return ModelMapper().apply {
            with(configuration) {
                setFieldMatchingEnabled(true)
                fieldAccessLevel = org.modelmapper.config.Configuration.AccessLevel.PRIVATE
                matchingStrategy = MatchingStrategies.LOOSE
            }
        }
    }
}