package com.example.advweek4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advweek4.model.Student

class ListViewModel:ViewModel() {
    val studentsLD=MutableLiveData<List<Student>>()
    val loadingErrorLD=MutableLiveData<Boolean>()
    val loadingLD= MutableLiveData<Boolean>()

    fun refresh(){
        val student1=Student("160718001","Tari","2018/05/10","911","http://dummyimage.com/100x70.jpg/000000/ffffff")
        val student2=Student("160718002","Tedi","2018/04/08","911","http://dummyimage.com/100x70.jpg/000000/ffffff")
        val student3=Student("160718003","Tika","2018/01/09","911","http://dummyimage.com/100x70.jpg/000000/ffffff")

        val studentList:ArrayList<Student> = arrayListOf(student1,student2,student3)
        studentsLD.value=studentList
        loadingErrorLD.value=false
        loadingLD.value=false
    }
}