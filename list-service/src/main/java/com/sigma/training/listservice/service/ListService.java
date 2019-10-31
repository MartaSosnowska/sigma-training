package com.sigma.training.listservice.service;

import com.sigma.training.listservice.dto.ItemDTO;
import com.sigma.training.listservice.dto.ListDTO;
import java.util.List;

public interface ListService {

    List<ListDTO> getLists(); //(GET) /rest/list: Obtains all lists
    ListDTO getList(long id); //(GET) /rest/list/{id}: Obtains the List for the given id
    ListDTO createList(ListDTO list); //(POST) /rest/list: Creates a new List with items
    ListDTO createList(String name, String description); //(POST) /rest/list/{name}/{description}: Creates a new List without items
    ListDTO updateList(long id, String name, String description); //(PUT) /rest/list/{id}/{name}/{description}: Updates the List for the given id
    ListDTO deleteList(long id); //(DELETE) /rest/list/{id}: Deletes the List for the given id with all its items

    List<ItemDTO> getItems(long listId); //(GET) /rest/list/{listId}/items: Obtains the items of a List
    ListDTO addItem(long listId, ItemDTO item); //(POST) /rest/list/{listId}/item: Adds a new item to a List
    ListDTO addItems(long listId, List<ItemDTO> items); //(POST) /rest/list/{listId}/items: Adds a set of items to a List
    ListDTO updateItem(long listId, long itemId, String name, String description); //(PUT) /rest/list/{listId}/item/{itemId}/{name}/{description}: Updates an Item of a List
    ListDTO removeItem(long listId, long itemId); //(DELETE) /rest/list/{listId}/item/{itemId}: Removes an Item of a List
    ListDTO removeItems(long listId); //(DELETE) /rest/list/{listId}/items: Removes all items from a List


}
