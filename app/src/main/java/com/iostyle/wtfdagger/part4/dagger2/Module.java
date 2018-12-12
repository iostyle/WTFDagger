package com.iostyle.wtfdagger.part4.dagger2;

import com.iostyle.wtfdagger.part4.dagger.ModuleA;
import com.iostyle.wtfdagger.part4.dagger.ModuleB;
import com.iostyle.wtfdagger.part4.dagger.ModuleC;

@dagger.Module(includes = {ModuleA.class, ModuleB.class, ModuleC.class})
public class Module {
}
