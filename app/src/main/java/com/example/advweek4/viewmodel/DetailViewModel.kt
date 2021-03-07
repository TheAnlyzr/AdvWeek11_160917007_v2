package com.example.advweek4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advweek4.model.Student

class DetailViewModel:ViewModel() {
    val studentLD= MutableLiveData<Student>()

    fun fetch(){
        val student1 = Student("160718008","Geri","2018/04/12","911","http://dummyimage.com/75x100.jpg/000000/ffffff")

        studentLD.value=student1
    }


}