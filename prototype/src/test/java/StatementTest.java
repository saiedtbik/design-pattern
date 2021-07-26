import org.junit.Before;
import org.junit.Test;


public class StatementTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testClone() {
        Statement st = Statement.getBuilder()
                .setFrom("from Student")
                .setProjection("select nationalId, max(score)")
                .setWhere("score > 10")
                .setGroupBy("group by nationalId")
                .setRecord(new Record())
                .createStatement();

        System.out.println("St : " + st.hashCode());
        System.out.println("StRecode : " + st.getRecord().hashCode());

        Statement cloneSt = st.clone();
        System.out.println("cloneSt : " + cloneSt.hashCode());
        System.out.println("cloneStRecord :" + cloneSt.getRecord().hashCode());

    }
}