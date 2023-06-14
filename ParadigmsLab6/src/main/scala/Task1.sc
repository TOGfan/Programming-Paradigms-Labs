
class Branch(var name:String,var left:Branch,var right: Branch)

def find(toFind:String,branch:Branch): List[String] ={
  var result:List[String]=Nil
  if(branch.left!=null){
    result=find(toFind,branch.left):::result
  }
  if (branch.right != null) {
    result=find(toFind,branch.right) ::: result
  }
  if(branch.name.indexOf(toFind)!=(-1))
    result=branch.name::result
  result
}

println(find("Tes",new Branch("Test", new Branch("Testtt", null, null), new Branch("estt", null, new Branch("SuperTes", null, null)))))
