package com.shotrybin.binplugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class BinTask extends DefaultTask {
    @TaskAction
    public void bin(){
        System.out.println("测试 bin");
    }
}
