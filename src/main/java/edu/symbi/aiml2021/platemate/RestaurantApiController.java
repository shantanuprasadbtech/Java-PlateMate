package edu.symbi.aiml2021.platemate;

import edu.symbi.aiml2021.platemate.guest.Guest;
import edu.symbi.aiml2021.platemate.restaurant.*;
import edu.symbi.aiml2021.platemate.restaurant.exceptions.NoTablesAvailableException;
import edu.symbi.aiml2021.platemate.restaurant.menu.MenuItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurant")
public class RestaurantApiController {
    Restaurant restaurant;

    public RestaurantApiController() {
        restaurant = new Restaurant("LittleItaly", "Balewadi High Street, Pune", "020-12345678", 5);
    }

    @RequestMapping(value = "/S01GuestArrived", method = RequestMethod.POST)
    public Guest restaurantGuestArrived(String name, String contact, int accompanyingGuests) throws NoTablesAvailableException {
        return restaurant.guestArrived(name, contact, accompanyingGuests);
    }

    @RequestMapping(value = "/S02RequestWaiter", method = RequestMethod.GET)
    public Waiter restaurantRequestWaiter(int tableId) throws NoTablesAvailableException {
        return restaurant.assignWaiter(tableId);
    }

    @RequestMapping(value = "/S03WaiterShowsMenuCard", method = RequestMethod.GET)
    public List<MenuItem> restaurantWaiterShowsMenuCard(int waiterId) {
        return restaurant.waiterShowsMenucard(waiterId);
    }


    @RequestMapping(value = "/S04WaiterCreatesOrderForTable", method = RequestMethod.GET)
    public OrderDetail restaurantWaiterCreatesOrderForTable(int waiterId, int tableId) {
        return  restaurant.waiterCreatesOrderForTable(waiterId, tableId);
    }

    @RequestMapping(value = "/S05WaiterUpdatesOrder", method = RequestMethod.PUT)
    public OrderDetail restaurantWaiterUpdatesOrder(int orderId, int menuId, int quantity) {
        return  restaurant.waiterUpdatesOrder(orderId, menuId, quantity);
    }

    @RequestMapping(value = "/S06waiterPlacesOrder", method = RequestMethod.PUT)
    public OrderDetail restaurantWaiterPlacesOrder(int orderId) {
        return  restaurant.waiterPlacesOrder(orderId);
    }
    @RequestMapping(value = "/S07orderStatus", method = RequestMethod.GET)
    public OrderDetail restaurantCheckOrderStatus(int orderId) {
        return  restaurant.waiterChecksOrderStatus(orderId);
    }

    @RequestMapping(value = "/S08WaiterGetsACheck", method = RequestMethod.GET)
    public Check restaurantWaiterGetsACheck(int orderId) {
        return  restaurant.waiterGetsACheck(orderId);
    }
    @RequestMapping(value = "/S09GetTableStatus", method = RequestMethod.GET)
    public Map<Table,Guest> restaurantGetTableStatus() {
        return  restaurant.getTableStatus();
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String restaurantGuestArrived() {
        return restaurant.getRestaurantName();
    }
}
