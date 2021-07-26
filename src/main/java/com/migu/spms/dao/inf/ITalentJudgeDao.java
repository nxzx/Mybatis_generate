package com.migu.spms.dao.inf;

import com.migu.spms.dao.entity.talentJudgeCriteria;
import com.migu.spms.dao.entity.talentJudgeDO;
import org.springframework.stereotype.Repository;

@Repository("iTalentJudgeDao")
public interface ITalentJudgeDao extends IBasicDao<talentJudgeDO, talentJudgeCriteria> {
}