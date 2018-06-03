package client;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import ee.ttu.idu0075._2018.ws.cyclingresults.wsdl.*;
import ee.ttu.idu0075.cyclingresults.dao.DiplomaRepository;
import ee.ttu.idu0075.cyclingresults.dto.DiplomaService;

import java.util.Scanner;

public class Main {

    private static DiplomaService diplomaService;

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose to either view a diploma (press 1) or add a diploma (2) or to exit (3)");
        String response = scanner.next();
        switch (response) {
            case "1":
                diplomaToString();
                break;
            case "2":
                addDiploma();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Someone messed up, it was not me though...");
                break;
        }
    }

    private static void diplomaToString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the ID of the diploma you wish to see");
        String id = scanner.nextLine();
        System.out.println(getDiplomaById(Long.parseLong(id)));
    }


    private static Diploma getDiplomaById(long id) {
        return diplomaService.findById(id);
    }

    private static void addDiploma() {
        Scanner scanner = new Scanner(System.in);
        AddDiplomaRequest request = new AddDiplomaRequest();
        System.out.println("Please enter your security token");
        String token = scanner.nextLine();
        request.setToken(token);
        if (token.equals("secrettoken123")) {
            System.out.println("Please enter the name of the event");
            String event = scanner.nextLine();
            request.setEvent(event);
            System.out.println("Please enter the the placement of the competitor in a number format");
            String placement = scanner.nextLine();
            request.setPlacement(Integer.parseInt(placement));
            System.out.println("Please enter the age group of the competitor");
            String agegroup = scanner.nextLine();
            request.setAgeGroup(Agegroups.fromValue(agegroup));
            //System.out.println("Please enter the time of the competitor (HH:MM:SS)");
            //String duration = scanner.nextLine();
            //request.setTime(XMLGregorianCalendarImpl.parse(duration));
            //System.out.println("Please enter the time of the event YYYY-MM-DD");
            //String time = scanner.nextLine();
            //request.setTimeOfEvent(XMLGregorianCalendarImpl.parse(time));
            addDiploma(request);
            System.out.println("New diploma added. Good job!");
        }
        start();
    }

    private static void addDiploma(AddDiplomaRequest request) {
        Diploma diploma = new Diploma();
        diploma.setTimeOfEvent(request.getTimeOfEvent());
        diploma.setTime(request.getTime());
        diploma.setPlacement(request.getPlacement());
        diploma.setEvent(request.getEvent());
        diploma.setAgeGroup(request.getAgeGroup().toString());
        diplomaService.save(diploma);
    }
}
