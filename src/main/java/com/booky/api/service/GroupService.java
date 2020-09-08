package com.booky.api.service;


import com.booky.api.exception.GroupServiceException;
import com.booky.api.model.Group;

import java.util.List;

public interface GroupService {

	Group create(Group group) throws GroupServiceException;

	List<Group> findMyGroups() throws GroupServiceException;

	Group findOneGroup(long groupId) throws GroupServiceException;
}