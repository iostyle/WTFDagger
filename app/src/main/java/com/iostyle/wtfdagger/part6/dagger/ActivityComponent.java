package com.iostyle.wtfdagger.part6.dagger;

import com.iostyle.wtfdagger.part6.Part6Act;

import dagger.Component;

/**
 * 假设ActivityComponent依赖ApplicationComponent。
 * 当使用ActivityComponent注入Container时，如果找不到对应的依赖，
 * 就会到ApplicationComponent中查找。
 * 但是，ApplicationComponent必须显式把ActivityComponent找不到的依赖提供给ActivityComponent。
 */
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(Part6Act act);
}
