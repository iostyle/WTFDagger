package com.iostyle.wtfdagger.part8.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 通过@Scope 区分作用于哪个 Component 即作用域
 * 如果Component是全局的 如Application中的静态变量 那么即为全局作用域
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PerApp {
}
