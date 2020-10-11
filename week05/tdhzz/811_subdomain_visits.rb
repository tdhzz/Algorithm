# @param {String[]} cpdomains
# @return {String[]}
def subdomain_visits(cpdomains)
  h = {}
  cpdomains.each do |x|
    number, domain = x.split(" ")
    number = number.to_i
    domain = domain.split(?.)
    while !domain.empty?
        str = domain.join(?.)
        h[str] ||= 0
        h[str] += number
        domain.shift
    end
   end
  h.to_a.map{|x| "#{x[1]} #{x[0]}"}
end
