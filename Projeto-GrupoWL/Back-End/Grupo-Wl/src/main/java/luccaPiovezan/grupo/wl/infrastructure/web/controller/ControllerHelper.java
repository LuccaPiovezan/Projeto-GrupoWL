package luccaPiovezan.grupo.wl.infrastructure.web.controller;

import org.springframework.ui.Model;

public class ControllerHelper {
	
	public static void setEditMode(Model model, boolean isEdit) {
		model.addAttribute("EditModel", isEdit);
	}

}
