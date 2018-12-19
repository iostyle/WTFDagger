package com.iostyle.wtfdagger.part7.dagger;

import com.iostyle.wtfdagger.part7.Part7Act;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 注意：Java中，单例通常保存在一个静态域中，这样的单例往往要等到虚拟机关闭时候，该单例所占用的资源才释放。
 * 但是，Dagger通过注解创建出来的单例并不保持在静态域上，而是保留在Component实例中。
 * 所以说不同的Component实例提供的对象是不同的。
 */
@Component(modules = HeroModule.class)
@Singleton //标明该Component中 有module 使用了@Singleton
public interface HeroComponent {
    void inject(Part7Act act);
}
