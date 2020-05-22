package peipeia.club.community.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import peipeia.club.community.dto.QuestionQueryDTO;
import peipeia.club.community.model.Question;
import peipeia.club.community.model.QuestionExample;

import java.util.List;

public interface QuestionExtMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Thu May 07 13:44:11 CST 2020
     */
    int inView(Question record);

    int CommentCount(Question record);

    List<Question> selectByRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);
}