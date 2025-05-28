package kr.ac.kumoh.s20221137.mysql_robot

import org.springframework.stereotype.Service

@Service
class RobotService(val repository: RobotRepository) {
    fun getAllRobots() = repository.findAll()
}