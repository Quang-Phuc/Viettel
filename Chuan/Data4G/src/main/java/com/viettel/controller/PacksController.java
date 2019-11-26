package com.viettel.controller;

import com.viettel.common.PageAction;
import com.viettel.model.Packs;
import com.viettel.service.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PacksController {
    @Autowired
    private PackService packService;

    @RequestMapping(value = "/savePack", method = RequestMethod.GET)
    public String savePackCar(@RequestParam("packId") int packId, Model model) {
        return PageAction.PacksPage.SAVE_PACK;
    }

    @RequestMapping(value = "/savePack", method = RequestMethod.POST)
    public String savePackPost(Packs packs, Model model) {
        packService.save(packs);
        model.addAttribute("listPacks", packService.findAllPack());
        return "redirect:" + PageAction.PacksPage.VIEW_PACKS;

    }

    @RequestMapping(value = "/updatePack", method = RequestMethod.GET)
    public String updatePack(@RequestParam("packId") int packId, Model model) {
        model.addAttribute("findPackById", packService.findPackById(packId));
        return  PageAction.PacksPage.EDIT_PACK;
    }

    @RequestMapping(value = "/updatePack", method = RequestMethod.POST)
    public String updatePackPost(Packs packs, Model model) {
        packService.save(packs);
        model.addAttribute("listPacks", packService.findAllPack());
        return "redirect:" + PageAction.PacksPage.VIEW_PACKS;
    }

    @RequestMapping(value = "/deletePack", method = RequestMethod.GET)
    public String deletePack(@RequestParam("packId") int packId, Model model) {
        packService.deleteById(packId);
        model.addAttribute("listPacks", packService.findAllPack());
        return "redirect:" + PageAction.PacksPage.VIEW_PACKS;
    }

    @RequestMapping(value = "/viewPack", method = RequestMethod.GET)
    public String viewPacks( Model model) {
        model.addAttribute("listPacks", packService.findAllPack());
        return "redirect:" + PageAction.PacksPage.VIEW_PACKS;

    }




}
