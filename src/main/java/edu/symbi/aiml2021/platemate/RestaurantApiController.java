package edu.symbi.aiml2021.platemate;

import edu.symbi.aiml2021.platemate.guest.Guest;
import edu.symbi.aiml2021.platemate.restaurant.Restaurant;
import edu.symbi.aiml2021.platemate.restaurant.Waiter;
import edu.symbi.aiml2021.platemate.restaurant.exceptions.NoTablesAvailableException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantApiController {
    Restaurant restaurant;

    public RestaurantApiController() {
        restaurant = new Restaurant("LittleItaly", "Balewadi High Street, Pune", "020-12345678", 5);
    }

    @RequestMapping(value = "/guestArrived", method = RequestMethod.POST)
    public Guest restaurantGuestArrived(String name, String contact, int accompanyingGuests) throws NoTablesAvailableException {
        return restaurant.guestArrived(name, contact, accompanyingGuests);
    }

    @RequestMapping(value = "/requestWaiter", method = RequestMethod.GET)
    public Waiter restaurantRequestWaiter(int tableId) throws NoTablesAvailableException {
        return restaurant.assignWaiter(tableId);
    }


    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String restaurantGuestArrived() {
        return restaurant.getRestaurantName();
    }
}
