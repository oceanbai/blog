# blog
这是博客的后端部分
public List<DeptTree> getDeptTree(List<SysDept> depts) {
         List<DeptTree> treeList = depts.stream()
                 .filter(dept -> !dept.getDeptId().equals(dept.getParentId()))
                 .map(dept -> {
                     DeptTree node = new DeptTree();
                     node.setId(dept.getDeptId());
                     node.setParentId(dept.getParentId());
                     node.setName(dept.getName());
                     return node;
                 }).collect(Collectors.toList());
         return TreeUtil.bulid(treeList, 0);
     }
getDeptTree
