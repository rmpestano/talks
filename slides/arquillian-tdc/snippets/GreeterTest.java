@RunWith([highlight]#Arquillian.class#)
public class GreeterTest {

    [highlight]#@Deployment#
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "test.jar")
            .addClass(Greeter.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    [highlight]#@Inject#
    Greeter greeter;

    @Test
    public void should_create_greeting() {
        Assert.assertEquals(
            "Hello, Earthling!", greeter.createGreeting("Earthling"));
    }
}
