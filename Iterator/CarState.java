package Iterator;
import java.io.IOException;

public enum CarState {
    DRIVING, WAITING, PARKING;
    public static CarState fromString(String state) throws Exception {
        switch (state) {
            case "DRIVING":
                return DRIVING;
                case "WAITING":
                    return WAITING;
                    case "PARKING":
                        return PARKING;
                        default:
                            throw new Exception("Invalid car state: " + state);
        }
    }
}
