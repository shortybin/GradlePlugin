package com.shotrybin.binplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class BinPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().register("bin",BinTask.class);
    }
}
