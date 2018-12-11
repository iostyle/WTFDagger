@Module: Module类里面的方法专门提供依赖，所以我们定义一个类，用@Module注解，这样Dagger在构造类的实例的时候，就知道从哪里去找到需要的依赖。

@Provides: 在Module中，我们定义的方法是用这个注解，以此来告诉Dagger我们想要构造对象并提供这些依赖。

@Inject: 通常在需要依赖的地方使用这个注解。换句话说，你用它告诉Dagger这个类或者字段需要依赖注入。这样，Dagger就会构造一个这个类的实例并满足他们的依赖。

@Component: Component从根本上来说就是一个注入器，也可以说是@Inject和@Module的桥梁，它的主要作用就是连接这两个部分。将Module中产生的依赖对象自动注入到需要依赖实例的Container中。

@Scope: Dagger2可以通过自定义注解限定注解作用域，来管理每个对象实例的生命周期。

@Qualifier: 当类的类型不足以鉴别一个依赖的时候，我们就可以使用这个注解标示。例如：在Android中，我们会需要不同类型的context，所以我们就可以定义 qualifier注解“@perApp”和“@perActivity”，这样当注入一个context的时候，我们就可以告诉 Dagger我们想要哪种类型的context。

---

为了便于理解，其实可以把component想象成针管，module是注射瓶，里面的依赖对象是注入的药水，build方法是插进患者（Container），inject方法的调用是推动活塞。