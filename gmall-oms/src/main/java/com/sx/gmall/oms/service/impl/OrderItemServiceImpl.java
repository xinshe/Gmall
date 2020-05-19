package com.sx.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sx.gmall.oms.entity.OrderItem;
import com.sx.gmall.oms.mapper.OrderItemMapper;
import com.sx.gmall.oms.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-16
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
