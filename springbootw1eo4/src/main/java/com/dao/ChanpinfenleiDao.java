package com.dao;

import com.entity.ChanpinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinfenleiVO;
import com.entity.view.ChanpinfenleiView;


/**
 * 产品分类
 * 
 * @author 
 * @email 
 * @date 2023-03-19 17:44:19
 */
public interface ChanpinfenleiDao extends BaseMapper<ChanpinfenleiEntity> {
	
	List<ChanpinfenleiVO> selectListVO(@Param("ew") Wrapper<ChanpinfenleiEntity> wrapper);
	
	ChanpinfenleiVO selectVO(@Param("ew") Wrapper<ChanpinfenleiEntity> wrapper);
	
	List<ChanpinfenleiView> selectListView(@Param("ew") Wrapper<ChanpinfenleiEntity> wrapper);

	List<ChanpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinfenleiEntity> wrapper);
	
	ChanpinfenleiView selectView(@Param("ew") Wrapper<ChanpinfenleiEntity> wrapper);
	

}
