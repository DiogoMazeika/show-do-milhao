import java.util.Map;

public class AlternativaConversor {
    private static Map<String, Integer> alternativasString = Map.of(
            "a", 1,
            "b", 2,
            "c", 3,
            "d", 4,
            "1", 5,
            "2", 6);

    private static Map<Integer, String> alternativasInt = Map.of(
            1, "a",
            2, "b",
            3, "c",
            4, "d");

    public static int toInt(String vl) {
        try{
            return alternativasString.get(vl);
        } catch (Exception e) {
            return 0;
        }
    }

    public static String toString(int vl) {
        try{
            return alternativasInt.get(vl);
        } catch (Exception e) {
            return "";
        }
    }

}
