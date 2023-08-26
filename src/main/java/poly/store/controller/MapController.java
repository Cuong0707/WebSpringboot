package poly.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("map")
public class MapController {
	@RequestMapping("ggmap")
	public String home() {
		
		return "Map/Map";
	}
}
