package shop.mtcoding.momo.dto.board;

import lombok.Getter;
import lombok.Setter;

public class BoardResp {

    @Setter
    @Getter
    public static class BoardMainRespDto {
        private int id;
        private String title;
        private String username;
    }
}