package com.sx.gmall.ums.service.impl;

import com.sx.gmall.ums.entity.Member;
import com.sx.gmall.ums.mapper.MemberMapper;
import com.sx.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-16
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
