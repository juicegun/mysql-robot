package kr.ac.kumoh.s20221137.mysql_robot

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/robots")
class RobotControl(val service: RobotService) {
//    @GetMapping("/")
//    open fun welcome() = "Welcome to Robot Server "

    @GetMapping
    fun getAllRobots(): ResponseEntity<List<Robot>> {
        val robot = service.getAllRobots()
        return ResponseEntity.ok(robot)
    }
}