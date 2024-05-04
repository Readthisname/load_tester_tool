package com.example.loadtestertool.controller;

import com.example.loadtestertool.entity.Openshift;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class LoadTesterToolController {

  @GetMapping("/")
  public String index(Model model) {
    return "index";
  }

  @GetMapping("/openshift/new")
  public String addOpenshift(Model model) {
    Openshift openshift = new Openshift();

    model.addAttribute("tutorial", openshift);
    model.addAttribute("pageTitle", "Create new Openshift");

    return "form";
  }

//  @GetMapping("/config/new")
//  public String addConfig(Model model) {
//    OpenshiftConfig tutorial = new Tutorial();
//    tutorial.setPublished(true);
//
//    model.addAttribute("tutorial", tutorial);
//    model.addAttribute("pageTitle", "Create new Tutorial");
//
//    return "config_form";
//  }

//  @PostMapping("/tutorials/save")
//  public String saveTutorial(Tutorial tutorial, RedirectAttributes redirectAttributes) {
//    try {
//      tutorialRepository.save(tutorial);
//
//      redirectAttributes.addFlashAttribute("message", "The Tutorial has been saved successfully!");
//    } catch (Exception e) {
//      redirectAttributes.addAttribute("message", e.getMessage());
//    }
//
//    return "redirect:/tutorials";
//  }
//
//  @GetMapping("/tutorials/{id}")
//  public String editTutorial(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
//    try {
//      Tutorial tutorial = tutorialRepository.findById(id).get();
//
//      model.addAttribute("tutorial", tutorial);
//      model.addAttribute("pageTitle", "Edit Tutorial (ID: " + id + ")");
//
//      return "tutorial_form";
//    } catch (Exception e) {
//      redirectAttributes.addFlashAttribute("message", e.getMessage());
//
//      return "redirect:/tutorials";
//    }
//  }
//
//  @GetMapping("/tutorials/delete/{id}")
//  public String deleteTutorial(@PathVariable("id") Integer id, Model model, RedirectAttributes redirectAttributes) {
//    try {
//      tutorialRepository.deleteById(id);
//
//      redirectAttributes.addFlashAttribute("message", "The Tutorial with id=" + id + " has been deleted successfully!");
//    } catch (Exception e) {
//      redirectAttributes.addFlashAttribute("message", e.getMessage());
//    }
//
//    return "redirect:/tutorials";
//  }
//
//  @GetMapping("/tutorials/{id}/published/{status}")
//  public String updateTutorialPublishedStatus(@PathVariable("id") Integer id, @PathVariable("status") boolean published,
//      Model model, RedirectAttributes redirectAttributes) {
//    try {
//      tutorialRepository.updatePublishedStatus(id, published);
//
//      String status = published ? "published" : "disabled";
//      String message = "The Tutorial id=" + id + " has been " + status;
//
//      redirectAttributes.addFlashAttribute("message", message);
//    } catch (Exception e) {
//      redirectAttributes.addFlashAttribute("message", e.getMessage());
//    }
//
//    return "redirect:/tutorials";
//  }
}
