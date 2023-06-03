package com.civalue.math;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.ParameterConverters;

import java.text.SimpleDateFormat;

import static org.jbehave.core.reporters.Format.*;


public class SerenityTestStories extends SerenityStories {
    //TODO: in order to customize your configurations
    // -override the provided methods in SerenityStories class
    // -add your custom class constructor
    //  public org.jbehave.core.configuration.Configuration configuration() {

    //@Override
    //public Configuration configuration() {
    public Configuration configurations() {
        Class<? extends Embeddable> embeddableClass = this.getClass();
        // Start from default ParameterConverters instance
        ParameterConverters parameterConverters = new ParameterConverters();
        // factory to allow parameter conversion and loading from external resources (used by StoryParser too)
        ExamplesTableFactory examplesTableFactory = new ExamplesTableFactory(new LocalizedKeywords(), new LoadFromClasspath(embeddableClass), parameterConverters);
        // add custom converters
        parameterConverters.addConverters(
                new ParameterConverters.DateConverter(new SimpleDateFormat("yyyy-MM-dd")),
                new ParameterConverters.EnumConverter()
        );

        //return new MostUsefulConfiguration()
        return super.configuration()
                .useStoryLoader(new LoadFromClasspath(embeddableClass))
                 .useStoryParser(new RegexStoryParser(examplesTableFactory))
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withCodeLocation(CodeLocations.codeLocationFromClass(embeddableClass))
                        .withDefaultFormats()
                        .withFormats(CONSOLE, TXT, HTML, XML))
                .useParameterConverters(parameterConverters);
    }
}
