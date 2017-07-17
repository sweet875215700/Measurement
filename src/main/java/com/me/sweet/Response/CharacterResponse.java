package com.me.sweet.Response;

import com.me.sweet.domain.Result;

/**
 * Created by weisw.shi on 2017/7/16.
 */
public class CharacterResponse extends BaseResponse {

    private Result data;


    public Result getData() {
        return data;
    }

    public void setData(Result data) {
        this.data = data;
    }


    public static CharacterResponse fail(int code,String tips){
        CharacterResponse characterResponse = new CharacterResponse();
        characterResponse.setCode(code);
        characterResponse.setTips(tips);
        return  characterResponse;
    }

    public static CharacterResponse success(int a,int b,int c,int d,String name){
        CharacterResponse characterResponse = new CharacterResponse();
        Result result = new Result();
        result.setSocoreA(a);
        result.setSocoreB(b);
        result.setSocoreC(c);
        result.setSocoreD(d);
        result.setName(name);
        characterResponse.setData(result);
        return characterResponse;
    }
}
