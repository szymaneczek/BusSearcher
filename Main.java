import dto.RouteSearchDto;
import resources.CityResource;
import services.CityService;
import services.RouteSearchService;

public class Main {

    public static void main(String[] args) {

        CityService cityService = new CityService(new CityResource());
        RouteSearchService routeSearchService = new RouteSearchService(cityService);

        System.out.println("Looking for route from Lublin (Poland) to Berlin (Germany):");
        RouteSearchDto findFirstRoute = routeSearchService.findRoutes("LUB", "BER");
        System.out.println("Found direct route: " + findFirstRoute.getDirectRoute());
        System.out.println("Found joint routes: " + findFirstRoute.getJointRoutes());

        System.out.println("Looking for route from Warsaw (Poland) to Paris (France): ");
        RouteSearchDto findSecondRoute = routeSearchService.findRoutes("WAW", "par");
        System.out.println("Found direct route: " + findSecondRoute.getDirectRoute());
        System.out.println("Found joint route: " + findSecondRoute.getJointRoutes());
    }
}
