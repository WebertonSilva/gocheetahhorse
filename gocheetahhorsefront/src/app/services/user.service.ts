import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';


@Injectable()
export class UserService {


    constructor(private _http: Http){
    }

    getUsers(url){
        return this._http.get(url)
            .map(res => res.json());
    }

    getUser(userId, url){
        return this._http.get(this.getUserUrl(userId, url))
            .map(res => res.json());
    }

    addUser(url, user){
        let headers = new Headers({ 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': '*'});
        let options = new RequestOptions({ headers: headers });
        return this._http.post(url, user, options)
            .map(res => res.json());
    }

    updateUser(user, url){
        return this._http.put(this.getUserUrl(user.id, url), JSON.stringify(user))
            .map(res => res.json());
    }

    deleteUser(userId, url){
        return this._http.delete(this.getUserUrl(userId, url))
            .map(res => res.json());
    }

    private getUserUrl(userId, url){
        return url + "/" + userId;
    }
}