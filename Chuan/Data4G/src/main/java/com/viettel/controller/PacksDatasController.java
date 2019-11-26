package com.viettel.controller;

import com.viettel.common.PageAction;
import com.viettel.model.PackDatas;
import com.viettel.service.PackDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class PacksDatasController {
    @Autowired
    private PackDataService packDataService;

    @RequestMapping(value = "/savePackData", method = RequestMethod.GET)
    public String savePackCar(@RequestParam("packId") int packId, Model model) {
        return PageAction.PackDataPage.SAVE_PACKDATA;
    }

    @RequestMapping(value = "/savePackData", method = RequestMethod.POST)
    public String savePackPost(PackDatas packDatas, Model model) {
        packDataService.save(packDatas);
        model.addAttribute("listPackDatas", packDataService.findAllPackDatas());
        return "redirect:" + PageAction.PackDataPage.VIEW_PACKDATA;

    }

    @RequestMapping(value = "/updatePackData", method = RequestMethod.GET)
    public String updatePack(@RequestParam("packDataId") int packDataId, Model model) {
        model.addAttribute("findPackDataById", packDataService.findPackDataById(packDataId));
        return  PageAction.PackDataPage.EDIT_PACKDATA;
    }

    @RequestMapping(value = "/updatePackData", method = RequestMethod.POST)
    public String updatePackPost(PackDatas packDatas, Model model) {
        packDataService.save(packDatas);
        model.addAttribute("listPackData", packDataService.findAllPackDatas());
        return "redirect:" + PageAction.PackDataPage.VIEW_PACKDATA;
    }

    @RequestMapping(value = "/deletePackData", method = RequestMethod.GET)
    public String deletePackData(@RequestParam("packDataId") int packDataId, Model model) {
        packDataService.deleteById(packDataId);
        model.addAttribute("listPackData", packDataService.findAllPackDatas());
        return "redirect:" + PageAction.PackDataPage.VIEW_PACKDATA;
    }

    @RequestMapping(value = "/viewPackData", method = RequestMethod.GET)
    public String viewPacks( Model model) {
        model.addAttribute("listPackData", packDataService.findAllPackDatas());
        return "redirect:" + PageAction.PackDataPage.VIEW_PACKDATA;

    }

}
