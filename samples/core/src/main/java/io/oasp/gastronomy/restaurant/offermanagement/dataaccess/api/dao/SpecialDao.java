package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialsSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author DGONTARE
 *
 */
public interface SpecialDao extends ApplicationDao<SpecialEntity>, MasterDataDao<SpecialEntity> {
  // SpecialSearchCriteriaTo

  PaginatedListTo<SpecialEntity> findSpecials(SpecialsSearchCriteriaTo criteria);

}
