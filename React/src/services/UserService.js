import axios from "axios";
export default class UserService {
 
    getUser(){
        return axios.get("http://localhost:8080/api/users/getAll")
    }
    getUserById(id){
        return axios.get("http://localhost:8080/api/users/getById?id="+id)
    }
}
