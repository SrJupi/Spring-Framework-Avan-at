package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.controllers;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalAddDTO;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto.SucursalUpdateDTO;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SucursalController {

    @Autowired
    private SucursalService service;

    @GetMapping("/sucursal/getAll")
    public String getAll(Model model){
        model.addAttribute("sucursals", service.getAll());
        return "get";
    }

    @GetMapping("/sucursal/getOne/{id}")
    public String getSucursal(@PathVariable Integer id, Model model){
        model.addAttribute("sucursals", service.getSucursal(id));
        return "get";
    }

    @GetMapping("/sucursal/add")
    public String createAddForm (Model model){
        SucursalAddDTO addDTO = new SucursalAddDTO();
        model.addAttribute("addDTO", addDTO);
        return "addForm";
    }

    @PostMapping("/sucursal/add")
    public String addSucursal(SucursalAddDTO sucursal, Model model) {
        model.addAttribute("sucursals", service.addSucursal(sucursal));
        return "addResult";
    }

    @GetMapping("/sucursal/update")
    public String createUpdateForm (Model model){
        SucursalUpdateDTO updateDTO = new SucursalUpdateDTO();
        model.addAttribute("updateDTO", updateDTO);
        return "updateForm";
    }
    @PostMapping("sucursal/update")
    public String updateSucursal(SucursalUpdateDTO sucursal, Model model){
        model.addAttribute("sucursals", service.updateSucursal(sucursal));
        return "updateResult";
    }

    @GetMapping("sucursal/delete/{id}")
    public String deleteSucursal(@PathVariable Integer id, Model model){
        model.addAttribute("sucursals", service.deleteSucursal(id));
        return "deleteid";
    }
}
