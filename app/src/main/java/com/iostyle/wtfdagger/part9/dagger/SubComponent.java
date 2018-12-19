package com.iostyle.wtfdagger.part9.dagger;

import com.iostyle.wtfdagger.part9.Part9Act;

/**
 * 子组件
 *
 * 可以使用@Subcomponent注解拓展原有component。
 * Subcomponent其功能效果优点类似component的dependencies。
 * 但是使用@Subcomponent不需要在父component中显式添加子component需要用到的对象，
 * 只需要添加返回子Component的方法即可，子Component能自动在父Component中查找缺失的依赖。
 */
@dagger.Subcomponent(modules = Module.class)
public interface SubComponent {
    void inject(Part9Act act);
}
